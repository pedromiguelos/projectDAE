/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Pedro S
 */
public class Proposal implements Serializable{
    
    @Id
    private int id;   
    @NotNull(message = "You must define a type of proposal")
    private int type;    
    @NotNull(message = "Proposal title can not be empty")
    private String title;
    @NotNull(message = "You must declare some cientific areas related to your proposal")
    private List<CientificAreas> cientific_areas;
    @NotNull(message = "You must declare some proponents")
    private List<String> proponents;
    @NotNull(message = "You must define some objectives of what you are proposing")
    private List<String> objectives;
    @NotNull(message = "Bibliography can not be empty")
    private List<String> bibliography;
    @NotNull(message = "You must have a working plan")
    private List<String> workingPlan;
    @NotNull(message = "Local can not be empty")
    private String local;
    @NotNull(message = "You must define some some fundamental requirements so that your work can be successful")
    private List<String> requirements;
    @NotNull(message = "Budget can not be empty")
    private Float budget;
    //apoios (financeiros ou de outro tipo)
    @NotNull(message = "A proposal must have mentors")
    private List<Teacher> mentors;
    @NotNull(message = "A proposal must have one supervisor")
    private Institution supervisor;

    public Proposal(int id, int type, String title, List<CientificAreas> cientific_areas, List<String> proponents, List<String> objectives, List<String> bibliography, List<String> workingPlan, String local, List<String> requirements, Float budget, List<Teacher> mentors, Institution supervisor) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.cientific_areas = cientific_areas;
        this.proponents = proponents;
        this.objectives = objectives;
        this.bibliography = bibliography;
        this.workingPlan = workingPlan;
        this.local = local;
        this.requirements = requirements;
        this.budget = budget;
        this.mentors = mentors;
        this.supervisor = supervisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CientificAreas> getCientific_areas() {
        return cientific_areas;
    }

    public void setCientific_areas(List<CientificAreas> cientific_areas) {
        this.cientific_areas = cientific_areas;
    }

    public List<String> getProponents() {
        return proponents;
    }

    public void setProponents(List<String> proponents) {
        this.proponents = proponents;
    }

    public List<String> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<String> objectives) {
        this.objectives = objectives;
    }

    public List<String> getBibliography() {
        return bibliography;
    }

    public void setBibliography(List<String> bibliography) {
        this.bibliography = bibliography;
    }

    public List<String> getWorkingPlan() {
        return workingPlan;
    }

    public void setWorkingPlan(List<String> workingPlan) {
        this.workingPlan = workingPlan;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public List<Teacher> getMentors() {
        return mentors;
    }

    public void setMentors(List<Teacher> mentors) {
        this.mentors = mentors;
    }

    public Institution getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Institution supervisor) {
        this.supervisor = supervisor;
    }
    
    
    
    
    

}
