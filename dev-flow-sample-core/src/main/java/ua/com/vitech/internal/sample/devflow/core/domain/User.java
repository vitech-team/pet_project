package ua.com.vitech.internal.sample.devflow.core.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dev_flow_sample_user")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String username;

    String requestUrl;

    Date dateOfVisit;
}
