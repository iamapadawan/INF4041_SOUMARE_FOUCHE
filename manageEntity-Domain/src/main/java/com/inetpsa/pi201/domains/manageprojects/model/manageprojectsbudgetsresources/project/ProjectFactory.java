package com.inetpsa.pi201.domains.manageprojects.model.manageprojectsbudgetsresources.project;

import java.util.Date;

import org.seedstack.business.domain.GenericFactory;

public interface ProjectFactory extends GenericFactory<Project> {

    /**
     * Create a project from a name project which is assumed unique.
     * 
     * @param pProjectName
     */
    public Project createProject(String pProjectName);

    /**
     * Add a deliverable to a given project. The name of deliverable is unique in a given project.
     * 
     * @param pParentProject
     * @param pDeliverableName
     * @param pDateStart
     * @param pDateEnd
     * @param pDateNewStart
     * @param pDateNewEnd
     * @param pComment
     */
    public Deliverable addDeliverableToProject(Project pParentProject, String pDeliverableName, Date pDateStart, Date pDateEnd, Date pDateNewStart,
            Date pDateNewEnd, String pComment);

    /**
     * Get a deliverable for a given project from a deliverable name
     * 
     * @param pNameDeliverable
     * @param pParentProject
     */
    public Deliverable getDeliverable(String pNameDeliverable, Project pParentProject);

    /**
     * Add a manager to a given Project. We can update the manager of the Project. The manager has to be register in database. We only can add an
     * existing manager to the Project.
     * 
     * @param pResponsableId
     * @param pParentProject
     */
    public void addResponsibleToProject(String pResponsableId, Project pParentProject);

    /**
     * Add a manager to a given Deliverable. We can update the manager of the Deliverable. The manager has to be register in database. We only can add
     * an existing manager to the Deliverable.
     * 
     * @param pResponsableId
     * @param pParentDeliverable
     */
    public void addResponsibleToDeliverable(String pResponsableId, Deliverable pParentDeliverable);

}