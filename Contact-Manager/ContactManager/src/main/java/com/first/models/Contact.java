package com.first.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
@Entity
public class Contact {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    @Size(min = 8 ,max = 12,message = "Enter Valid no")
    private String mobNO;

    public Contact(int id, String name, String description, String mobNO) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mobNO = mobNO;
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMobNO() {
        return mobNO;
    }

    public void setMobNO(String mobNO) {
        this.mobNO = mobNO;
    }

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", description=" 
	            + description + ", MobNO=" + mobNO + "]";
	}
    
    
    
}
