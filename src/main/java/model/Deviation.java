package model;

import java.util.Date;
import java.util.List;

/**
 * Deviation entity representing instances of process or output failures.
 */
public class Deviation {
    /**
     * Unique identifier of the deviation.
     */
    private int id;

    /**
     * Date when the deviation was identified.
     */
    private Date dateIdentified;

    /**
     * Detailed description of the deviation.
     */
    private String description;

    /**
     * Identifier of the person or mechanism that detected the deviation.
     */
    private String detectedBy;

    /**
     * Specific code assigned to the deviation.
     */
    private String deviationCode;

    /**
     * Severity level of the deviation.
     */
    private DeviationSeverity severity;

    /**
     * Current status of the deviation.
     */
    private DeviationStatus status;

    /**
     * Documents related to the deviation.
     */
    private List<Document> documents;

    /**
     * Root cause analyses associated with this deviation.
     */
    private List<RootCauseAnalyse> rootCauseAnalyses;

    /**
     * Corrective and preventive actions taken for this deviation.
     */
    private List<CorrectivePreventiveAction> correctivePreventiveActions;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateIdentified() {
        return dateIdentified;
    }

    public void setDateIdentified(Date dateIdentified) {
        this.dateIdentified = dateIdentified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetectedBy() {
        return detectedBy;
    }

    public void setDetectedBy(String detectedBy) {
        this.detectedBy = detectedBy;
    }

    public String getDeviationCode() {
        return deviationCode;
    }

    public void setDeviationCode(String deviationCode) {
        this.deviationCode = deviationCode;
    }

    public DeviationSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(DeviationSeverity severity) {
        this.severity = severity;
    }

    public DeviationStatus getStatus() {
        return status;
    }

    public void setStatus(DeviationStatus status) {
        this.status = status;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<RootCauseAnalyse> getRootCauseAnalyses() {
        return rootCauseAnalyses;
    }

    public void setRootCauseAnalyses(List<RootCauseAnalyse> rootCauseAnalyses) {
        this.rootCauseAnalyses = rootCauseAnalyses;
    }

    public List<CorrectivePreventiveAction> getCorrectivePreventiveActions() {
        return correctivePreventiveActions;
    }

    public void setCorrectivePreventiveActions(List<CorrectivePreventiveAction> correctivePreventiveActions) {
        this.correctivePreventiveActions = correctivePreventiveActions;
    }

    // toString Method

    @Override
    public String toString() {
        return "Deviation{" +
                "id=" + id +
                ", dateIdentified=" + dateIdentified +
                ", description='" + description + '\'' +
                ", detectedBy='" + detectedBy + '\'' +
                ", deviationCode='" + deviationCode + '\'' +
                ", severity=" + severity +
                ", status=" + status +
                ", documents=" + documents +
                ", rootCauseAnalyses=" + rootCauseAnalyses +
                ", correctivePreventiveActions=" + correctivePreventiveActions +
                '}';
    }

    // Enum Definitions

    public enum DeviationSeverity {
        LOW, MEDIUM, HIGH, CRITICAL
    }

    public enum DeviationStatus {
        IDENTIFIED, DOCUMENTED, UNDER_INVESTIGATION, ACTION_PLANNED, IMPLEMENTED, CLOSED
    }
}