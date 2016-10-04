//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.04 at 03:56:23 PM BST 
//


package org.linguafranca.pwdb.kdbx.jaxb.binding;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{}uuid"/&gt;
 *         &lt;element name="IconID" type="{}iconId"/&gt;
 *         &lt;element name="CustomIconUUID" type="{}customIconUuidRef" minOccurs="0"/&gt;
 *         &lt;element name="ForegroundColor" type="{}color"/&gt;
 *         &lt;element name="BackgroundColor" type="{}color"/&gt;
 *         &lt;element name="OverrideURL" type="{}overrideUrl"/&gt;
 *         &lt;element name="Tags" type="{}commaSeparatedList"/&gt;
 *         &lt;element ref="{}Times"/&gt;
 *         &lt;element name="String" type="{}stringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Binary" type="{}binaryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AutoType" type="{}autoType"/&gt;
 *         &lt;element ref="{}History" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uuid",
    "iconID",
    "customIconUUID",
    "foregroundColor",
    "backgroundColor",
    "overrideURL",
    "tags",
    "times",
    "string",
    "binary",
    "autoType",
    "history"
})
@XmlRootElement(name = "Entry")
public class Entry {

    @XmlElement(name = "UUID", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "base64Binary")
    protected UUID uuid;
    @XmlElement(name = "IconID")
    protected int iconID;
    @XmlElement(name = "CustomIconUUID", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "base64Binary")
    protected UUID customIconUUID;
    @XmlElement(name = "ForegroundColor", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String foregroundColor;
    @XmlElement(name = "BackgroundColor", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String backgroundColor;
    @XmlElement(name = "OverrideURL", required = true)
    protected String overrideURL;
    @XmlElement(name = "Tags", required = true)
    protected String tags;
    @XmlElement(name = "Times", required = true)
    protected Times times;
    @XmlElement(name = "String")
    protected List<StringField> string;
    @XmlElement(name = "Binary")
    protected List<BinaryField> binary;
    @XmlElement(name = "AutoType", required = true)
    protected AutoType autoType;
    @XmlElement(name = "History")
    protected History history;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the iconID property.
     * 
     */
    public int getIconID() {
        return iconID;
    }

    /**
     * Sets the value of the iconID property.
     * 
     */
    public void setIconID(int value) {
        this.iconID = value;
    }

    /**
     * Gets the value of the customIconUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getCustomIconUUID() {
        return customIconUUID;
    }

    /**
     * Sets the value of the customIconUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomIconUUID(UUID value) {
        this.customIconUUID = value;
    }

    /**
     * Gets the value of the foregroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForegroundColor() {
        return foregroundColor;
    }

    /**
     * Sets the value of the foregroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForegroundColor(String value) {
        this.foregroundColor = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the overrideURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideURL() {
        return overrideURL;
    }

    /**
     * Sets the value of the overrideURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideURL(String value) {
        this.overrideURL = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link Times }
     *     
     */
    public Times getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link Times }
     *     
     */
    public void setTimes(Times value) {
        this.times = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringField }
     * 
     * 
     */
    public List<StringField> getString() {
        if (string == null) {
            string = new ArrayList<StringField>();
        }
        return this.string;
    }

    /**
     * Gets the value of the binary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryField }
     * 
     * 
     */
    public List<BinaryField> getBinary() {
        if (binary == null) {
            binary = new ArrayList<BinaryField>();
        }
        return this.binary;
    }

    /**
     * Gets the value of the autoType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoType }
     *     
     */
    public AutoType getAutoType() {
        return autoType;
    }

    /**
     * Sets the value of the autoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoType }
     *     
     */
    public void setAutoType(AutoType value) {
        this.autoType = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link History }
     *     
     */
    public History getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link History }
     *     
     */
    public void setHistory(History value) {
        this.history = value;
    }

}
