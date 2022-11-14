package com.kimscompany.project_managing.domain.client;

import com.kimscompany.project_managing.domain.project.Project;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
public class Client {

    @Id @GeneratedValue
    @Column(name = "client_id")
    private Long id;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Project> projects = new ArrayList<>();

    private String name;

    public static Client createClient(String name) {
        Client client = new Client();
        client.setName(name);
        return client;
    }
}
