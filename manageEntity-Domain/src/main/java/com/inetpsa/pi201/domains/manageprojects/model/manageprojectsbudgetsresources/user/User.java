package com.inetpsa.pi201.domains.manageprojects.model.manageprojectsbudgetsresources.user;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.seedstack.business.domain.BaseAggregateRoot;

@Entity
public class User extends BaseAggregateRoot<String> {

    @Id
    private String login;
    private String name;
    private String firstName;

    public User() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public String getEntityId() {
        return login;
    }

    /**
     * @param newVal
     */
    public void setlogin(String newVal) {
        login = newVal;
    }

    public String getlogin() {
        return login;
    }

    /**
     * @param newVal
     */
    public void setfirstName(String newVal) {
        firstName = newVal;
    }

    public String getfirstName() {
        return firstName;
    }

    /**
     * @param newVal
     */
    public void setname(String newVal) {
        name = newVal;
    }

    public String getname() {
        return name;
    }

}