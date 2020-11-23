package de.rwth_aachen.dc.mvd.beans;

public class ElementCheckResultBean {
    private String ifcSpatialStructureElement=null;
    private String mvdXMLConcept;
    private String ifcClassName;
    private String guid;
    private String name;
    private String comment;
    private boolean isFine=false;

    
    public ElementCheckResultBean() {
	super();
    }

    public ElementCheckResultBean(String mvdXMLConcept, String ifcSpatialStructureElement, String ifcClassName,String guid, String name, String comment) {
	super();
	this.mvdXMLConcept=mvdXMLConcept;
	this.ifcSpatialStructureElement = ifcSpatialStructureElement;
	this.ifcClassName = ifcClassName;
	this.guid = guid;
	this.name = name;
	this.comment = comment;
    }

    public ElementCheckResultBean(String mvdXMLConcept, String ifcSpatialStructureElement, String ifcClassName,String guid, String name, String comment,boolean isFine) {
	super();
	this.mvdXMLConcept=mvdXMLConcept;
	this.ifcSpatialStructureElement = ifcSpatialStructureElement;
	this.ifcClassName = ifcClassName;
	this.guid = guid;
	this.name = name;
	this.comment = comment;
	this.isFine=isFine;
    }

    public ElementCheckResultBean(String mvdXMLConcept, String ifcSpatialStructureElement, String ifcClassName,String guid, String name, boolean isFine) {
   	super();
   	this.mvdXMLConcept=mvdXMLConcept;
   	this.ifcSpatialStructureElement = ifcSpatialStructureElement;
   	this.ifcClassName = ifcClassName;
   	this.guid = guid;
   	this.name = name;
   	this.isFine=isFine;
   	
   	if(this.isFine)
   	   	this.comment = guid+" element is fine.";
   	else
   	   	this.comment = guid+ " element is not fine.";

       }

    public ElementCheckResultBean(String mvdXMLConcept,String ifcClassName,String guid, String name, boolean isFine) {
   	super();
   	this.mvdXMLConcept=mvdXMLConcept;
   	this.ifcClassName = ifcClassName;
   	this.guid = guid;
   	this.name = name;
   	this.isFine=isFine;
   	
   	if(this.isFine)
   	   	this.comment = guid+" element is fine.";
   	else
   	   	this.comment = guid+ " element is not fine.";

       }

    
    public ElementCheckResultBean(String ifcClassName,String guid, String name, String comment) {
 	super();
 	this.ifcClassName = ifcClassName;
 	this.guid = guid;
 	this.name = name;
 	this.comment = comment;
     }

    public String getIfcSpatialStructureElement() {
	return ifcSpatialStructureElement;
    }

    
     public String getMvdXMLConcept() {
        return mvdXMLConcept;
    }

    public void setMvdXMLConcept(String mvdXMLConcept) {
        this.mvdXMLConcept = mvdXMLConcept;
    }

    public String getIfcClassName() {
        return ifcClassName;
    }

    public String getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
	return comment;
    }

    public void setIfcSpatialStructureElement(String ifcSpatialStructureElement) {
        this.ifcSpatialStructureElement = ifcSpatialStructureElement;
    }

    public void setIfcClassName(String ifcClassName) {
        this.ifcClassName = ifcClassName;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isFine() {
        return isFine;
    }

    public void setFine(boolean isFine) {
        this.isFine = isFine;
    }

    
}
