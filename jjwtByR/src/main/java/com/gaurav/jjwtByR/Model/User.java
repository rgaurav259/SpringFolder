package com.gaurav.jjwtByR.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "usr_tab")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String username;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "rolestab",
            joinColumns = @JoinColumn(name = "id"))
    @Column(name = "role")
    private Set<String> roles;

    //join and all optional here but we have mention just for the sake of learning
}
