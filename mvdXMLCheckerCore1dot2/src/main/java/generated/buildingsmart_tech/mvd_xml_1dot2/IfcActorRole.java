//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IfcActorRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcActorRole">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}Entity">
 *       &lt;attribute name="Role" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRoleEnum" />
 *       &lt;attribute name="UserDefinedRole" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLabel" />
 *       &lt;attribute name="Description" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcText" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcActorRole")
public class IfcActorRole
    extends Entity
{

    @XmlAttribute(name = "Role")
    protected IfcRoleEnum role;
    @XmlAttribute(name = "UserDefinedRole")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userDefinedRole;
    @XmlAttribute(name = "Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link IfcRoleEnum }
     *     
     */
    public IfcRoleEnum getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcRoleEnum }
     *     
     */
    public void setRole(IfcRoleEnum value) {
        this.role = value;
    }

    /**
     * Gets the value of the userDefinedRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefinedRole() {
        return userDefinedRole;
    }

    /**
     * Sets the value of the userDefinedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefinedRole(String value) {
        this.userDefinedRole = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
