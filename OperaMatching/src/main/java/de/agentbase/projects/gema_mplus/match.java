package de.agentbase.projects.gema_mplus;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(66ab8e2879a44851e6f91b5e92c18e80)
 */
@org.kie.api.definition.type.Label("Match")
public class match implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Autor")
   @org.kie.api.definition.type.Position(1)
   private java.lang.String author;

   @org.kie.api.definition.type.Label("Datum")
   @org.kie.api.definition.type.Position(2)
   private java.util.Date date;

   @org.kie.api.definition.type.Label("Dauer (in Sekunden)")
   @org.kie.api.definition.type.Position(3)
   private java.lang.Integer duration;

   @org.kie.api.definition.type.Label("WerkID")
   @org.kie.api.definition.type.Position(4)
   private java.lang.String opusID;

   @org.kie.api.definition.type.Label("Relevanz")
   @org.kie.api.definition.type.Position(5)
   private java.lang.Integer relevance;

   @org.kie.api.definition.type.Label("Titel")
   @org.kie.api.definition.type.Position(0)
   private java.lang.String title;

   @org.kie.api.definition.type.Label(value = "ausgew\u00E4hlt")
   private java.lang.Boolean selected;

   public match()
   {
   }

   public java.lang.String getAuthor()
   {
      return this.author;
   }

   public void setAuthor(java.lang.String author)
   {
      this.author = author;
   }

   public java.util.Date getDate()
   {
      return this.date;
   }

   public void setDate(java.util.Date date)
   {
      this.date = date;
   }

   public java.lang.Integer getDuration()
   {
      return this.duration;
   }

   public void setDuration(java.lang.Integer duration)
   {
      this.duration = duration;
   }

   public java.lang.String getOpusID()
   {
      return this.opusID;
   }

   public void setOpusID(java.lang.String opusID)
   {
      this.opusID = opusID;
   }

   public java.lang.Integer getRelevance()
   {
      return this.relevance;
   }

   public void setRelevance(java.lang.Integer relevance)
   {
      this.relevance = relevance;
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.Boolean getSelected()
   {
      return this.selected;
   }

   public void setSelected(java.lang.Boolean selected)
   {
      this.selected = selected;
   }

   public match(java.lang.String author, java.util.Date date,
         java.lang.Integer duration, java.lang.String opusID,
         java.lang.Integer relevance, java.lang.String title,
         java.lang.Boolean selected)
   {
      this.author = author;
      this.date = date;
      this.duration = duration;
      this.opusID = opusID;
      this.relevance = relevance;
      this.title = title;
      this.selected = selected;
   }

   public match(java.lang.String title, java.lang.String author,
         java.util.Date date, java.lang.Integer duration,
         java.lang.String opusID, java.lang.Integer relevance)
   {
      this.title = title;
      this.author = author;
      this.date = date;
      this.duration = duration;
      this.opusID = opusID;
      this.relevance = relevance;
   }
}