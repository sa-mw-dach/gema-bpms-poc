
package de.agentbase.gema.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für match complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="match">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dauer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relevanz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="werkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "match", propOrder = {
    "autor",
    "datum",
    "dauer",
    "relevanz",
    "titel",
    "werkId"
})
public class Match {

    protected String autor;
    protected String datum;
    protected String dauer;
    protected String relevanz;
    protected String titel;
    protected String werkId;

    /**
     * Ruft den Wert der autor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Legt den Wert der autor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Ruft den Wert der dauer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDauer() {
        return dauer;
    }

    /**
     * Legt den Wert der dauer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDauer(String value) {
        this.dauer = value;
    }

    /**
     * Ruft den Wert der relevanz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanz() {
        return relevanz;
    }

    /**
     * Legt den Wert der relevanz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanz(String value) {
        this.relevanz = value;
    }

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der werkId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerkId() {
        return werkId;
    }

    /**
     * Legt den Wert der werkId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerkId(String value) {
        this.werkId = value;
    }

}
