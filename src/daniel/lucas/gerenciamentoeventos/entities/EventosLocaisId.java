package daniel.lucas.gerenciamentoeventos.entities;
// Generated May 29, 2017 10:42:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EventosLocaisId generated by hbm2java
 */
@Embeddable
public class EventosLocaisId  implements java.io.Serializable {


     private int eventoId;
     private int localId;

    public EventosLocaisId() {
    }

    public EventosLocaisId(int eventoId, int localId) {
       this.eventoId = eventoId;
       this.localId = localId;
    }
   


    @Column(name="evento_id", nullable=false)
    public int getEventoId() {
        return this.eventoId;
    }
    
    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }


    @Column(name="local_id", nullable=false)
    public int getLocalId() {
        return this.localId;
    }
    
    public void setLocalId(int localId) {
        this.localId = localId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventosLocaisId) ) return false;
		 EventosLocaisId castOther = ( EventosLocaisId ) other; 
         
		 return (this.getEventoId()==castOther.getEventoId())
 && (this.getLocalId()==castOther.getLocalId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getEventoId();
         result = 37 * result + this.getLocalId();
         return result;
   }   


}


