//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 *       (out) Contains a list of tips on improving a listing's details, if any. 
 * 			
 * 
 * <p>Java class for ListingTipArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingTipArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTip" type="{urn:ebay:apis:eBLBaseComponents}ListingTipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingTipArrayType", propOrder = {
    "listingTip"
})
public class ListingTipArrayType {

    @XmlElement(name = "ListingTip")
    protected List<ListingTipType> listingTip;

    /**
     * Gets the value of the listingTip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingTip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingTip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListingTipType }
     * 
     * 
     */
    public List<ListingTipType> getListingTip() {
        if (listingTip == null) {
            listingTip = new ArrayList<ListingTipType>();
        }
        return this.listingTip;
    }

}