package daniel.lucas.gerenciamentoeventos.entities;
// Generated May 29, 2017 10:42:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EventosBuffets generated by hbm2java
 */
@Entity
@Table(name="eventos_buffets"
    ,catalog="gerenciadoreventos"
)
public class EventosBuffets  implements java.io.Serializable {


     private EventosBuffetsId id;
     private Buffets buffets;
     private Eventos eventos;
     private BigDecimal valor;

    public EventosBuffets() {
    }

    public EventosBuffets(EventosBuffetsId id, Buffets buffets, Eventos eventos, BigDecimal valor) {
       this.id = id;
       this.buffets = buffets;
       this.eventos = eventos;
       this.valor = valor;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventoId", column=@Column(name="evento_id", nullable=false) ), 
        @AttributeOverride(name="buffetId", column=@Column(name="buffet_id", nullable=false) ) } )
    public EventosBuffetsId getId() {
        return this.id;
    }
    
    public void setId(EventosBuffetsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="buffet_id", nullable=false, insertable=false, updatable=false)
    public Buffets getBuffets() {
        return this.buffets;
    }
    
    public void setBuffets(Buffets buffets) {
        this.buffets = buffets;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="evento_id", nullable=false, insertable=false, updatable=false)
    public Eventos getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    
    @Column(name="valor", nullable=false, precision=15)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }




}


