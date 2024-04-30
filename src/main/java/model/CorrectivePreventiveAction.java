package model;

import java.util.Date;

/**
 * Represents a Corrective or Preventive Action in the system.
 */
public class CorrectivePreventiveAction {

    /**
     * The unique identifier for the corrective_preventive action.
     */
    private int id;
    
    /**
     * The type of action, either corrective or preventive.
     */
    private ActionType actionType;
    
    /**
     * Detailed description of the action.
     */
    private String actionDescription;
    
    /**
     * The deviation associated with this action.
     */
    private Deviation deviation;
    
    /**
     * The document related to this action.
     */
    private Document document;
    
    /**
     * The person responsible for implementing the action.
     */
    private String responsiblePerson;
    
    /**
     * The deadline for completing the action.
     */
    private Date dueDate;
    
    /**
     * The current status of the action's implementation.
     */
    private ActionStatus status;
    
    /**
     * Defines the type of action as either corrective or preventive.
     */
    public enum ActionType {
        CORRECTIVE, PREVENTIVE
    }
    
    /**
     * Represents the implementation status of the action.
     */
    public enum ActionStatus {
        PENDING, IN_PROGRESS, COMPLETE, VERIFIED
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public Deviation getDeviation() {
        return deviation;
    }

    public void setDeviation(Deviation deviation) {
        this.deviation = deviation;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public ActionStatus getStatus() {
        return status;
    }

    public void setStatus(ActionStatus status) {
        this.status = status;
    }

    // toString Method
    @Override
    public String toString() {
        return "CorrectivePreventiveAction{" +
                "id=" + id +
                ", actionType=" + actionType +
                ", actionDescription='" + actionDescription + '\'' +
                ", deviation=" + deviation +
                ", document=" + document +
                ", responsiblePerson='" + responsiblePerson + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                '}';
    }
}