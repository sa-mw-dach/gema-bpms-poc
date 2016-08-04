package de.agentbase.projects.gema_mplus;

import java.util.ArrayList;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(82b97aaa49c8a26cb405ac831f2dd21a)
 */
@org.kie.api.definition.type.Label("MatchCollection")
public class matchCollection extends java.lang.Object implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private match matchToAdd;
   private boolean stopAdding;

   private java.lang.String name;

   @org.kie.api.definition.type.Label(value = "Match")
   @org.kie.api.definition.type.Position(value = 0)
   private java.util.List<de.agentbase.projects.gema_mplus.match> matchList;

   public matchCollection()
   {
      match = new ArrayList<de.agentbase.projects.gema_mplus.match>();
   }

   public match getMatchToAdd()
   {
      return matchToAdd;
   }

   public void setMatchToAdd(match matchToAdd)
   {
      match.add(matchToAdd);
      this.matchToAdd = matchToAdd;
   }

   public boolean isStopAdding()
   {
      return stopAdding;
   }

   public void setStopAdding(boolean stopAdding)
   {
      this.stopAdding = stopAdding;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.util.List<de.agentbase.projects.gema_mplus.match> getMatchList()
   {
      return this.matchList;
   }

   public void setMatchList(
         java.util.List<de.agentbase.projects.gema_mplus.match> matchList)
   {
      this.matchList = matchList;
   }

   public matchCollection(de.agentbase.projects.gema_mplus.match matchToAdd,
         boolean stopAdding, java.lang.String name,
         java.util.List<de.agentbase.projects.gema_mplus.match> matchList)
   {
      this.matchToAdd = matchToAdd;
      this.stopAdding = stopAdding;
      this.name = name;
      this.matchList = matchList;
   }

   public matchCollection(
         java.util.List<de.agentbase.projects.gema_mplus.match> matchList)
   {
      this.matchList = matchList;
   }
}