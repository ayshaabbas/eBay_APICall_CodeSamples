//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Packages supported by the enclosing shipping service.
 * 			
 * 
 * <p>Java class for ShippingServicePackageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServicePackageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="DimensionsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServicePackageDetailsType", propOrder = {
    "name",
    "dimensionsRequired"
})
public class ShippingServicePackageDetailsType {

    @XmlElement(name = "Name")
    protected ShippingPackageCodeType name;
    @XmlElement(name = "DimensionsRequired")
    protected Boolean dimensionsRequired;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setName(ShippingPackageCodeType value) {
        this.name = value;
    }

    /**
     * Gets the value of the dimensionsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDimensionsRequired() {
        return dimensionsRequired;
    }

    /**
     * Sets the value of the dimensionsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionsRequired(Boolean value) {
        this.dimensionsRequired = value;
    }

}