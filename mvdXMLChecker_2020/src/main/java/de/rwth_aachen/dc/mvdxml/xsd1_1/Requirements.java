//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.19 at 05:01:46 PM CET 
//


package de.rwth_aachen.dc.mvdxml.xsd1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Requirements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Requirements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requirement" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="exchangeRequirement" use="required" type="{http://buildingsmart-tech.org/mvd/XML/1.1}uuid" />
 *                 &lt;attribute name="requirement" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="mandatory"/>
 *                       &lt;enumeration value="recommended"/>
 *                       &lt;enumeration value="not-relevant"/>
 *                       &lt;enumeration value="not-recommended"/>
 *                       &lt;enumeration value="excluded"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="applicability" type="{http://buildingsmart-tech.org/mvd/XML/1.1}applicability" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Requirements", propOrder = {
    "requirement"
})
public class Requirements {

    @XmlElement(name = "Requirement", required = true)
    protected List<Requirements.Requirement> requirement;

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Requirements.Requirement }
     * 
     * 
     */
    public List<Requirements.Requirement> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<Requirements.Requirement>();
        }
        return this.requirement;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="exchangeRequirement" use="required" type="{http://buildingsmart-tech.org/mvd/XML/1.1}uuid" />
     *       &lt;attribute name="requirement" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="mandatory"/>
     *             &lt;enumeration value="recommended"/>
     *             &lt;enumeration value="not-relevant"/>
     *             &lt;enumeration value="not-recommended"/>
     *             &lt;enumeration value="excluded"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="applicability" type="{http://buildingsmart-tech.org/mvd/XML/1.1}applicability" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Requirement {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "exchangeRequirement", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String exchangeRequirement;
        @XmlAttribute(name = "requirement", required = true)
        protected String requirement;
        @XmlAttribute(name = "applicability")
        protected Applicability applicability;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the exchangeRequirement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExchangeRequirement() {
            return exchangeRequirement;
        }

        /**
         * Sets the value of the exchangeRequirement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExchangeRequirement(String value) {
            this.exchangeRequirement = value;
        }

        /**
         * Gets the value of the requirement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequirement() {
            return requirement;
        }

        /**
         * Sets the value of the requirement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequirement(String value) {
            this.requirement = value;
        }

        /**
         * Gets the value of the applicability property.
         * 
         * @return
         *     possible object is
         *     {@link Applicability }
         *     
         */
        public Applicability getApplicability() {
            return applicability;
        }

        /**
         * Sets the value of the applicability property.
         * 
         * @param value
         *     allowed object is
         *     {@link Applicability }
         *     
         */
        public void setApplicability(Applicability value) {
            this.applicability = value;
        }

    }

}
