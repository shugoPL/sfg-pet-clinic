package pl.com.shugo.ownpetclinic.data.model;

import java.io.Serializable;

public class Specialty extends BaseEntity implements Serializable {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
