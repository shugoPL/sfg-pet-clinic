package pl.com.shugo.ownpetclinic.data.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "specialities" )
public class Specialty extends BaseEntity {

    @Column(name = "desc")
    private String description;

}
