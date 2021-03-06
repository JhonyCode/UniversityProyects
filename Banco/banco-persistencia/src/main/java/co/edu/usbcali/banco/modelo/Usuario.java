package co.edu.usbcali.banco.modelo;
// Generated 25-jul-2017 23:40:32 by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements java.io.Serializable {

	@NotNull(message="no puede ser vacio")
	private String usuUsuario;
	@NotNull(message="no puede ser vacio")
	private TipoUsuario tipoUsuario;
	@NotNull(message="no puede ser vacio")
	@NotEmpty
	private String clave;
	@NotNull(message="no es valida")
	private BigDecimal identificacion;
	@NotNull(message="no puede ser vacio")
	@NotEmpty
	private String nombre;
	@NotNull(message=" no puede ser vacio")
	private char activo;
	private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);

	public Usuario() {
	}

	public Usuario(String usuUsuario, String clave, BigDecimal identificacion, String nombre, char activo) {
		this.usuUsuario = usuUsuario;
		this.clave = clave;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.activo = activo;
	}

	public Usuario(String usuUsuario, TipoUsuario tipoUsuario, String clave, BigDecimal identificacion, String nombre,
			char activo, Set<Transaccion> transaccions) {
		this.usuUsuario = usuUsuario;
		this.tipoUsuario = tipoUsuario;
		this.clave = clave;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.activo = activo;
		this.transaccions = transaccions;
	}

	@Id

	@Column(name = "usu_usuario", unique = true, nullable = false)
	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tius_id")
	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Column(name = "clave", nullable = false)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "identificacion", nullable = false, precision = 30, scale = 0)
	public BigDecimal getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(BigDecimal identificacion) {
		this.identificacion = identificacion;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "activo", nullable = false, length = 1)
	public char getActivo() {
		return this.activo;
	}

	public void setActivo(char activo) {
		this.activo = activo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Transaccion> getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(Set<Transaccion> transaccions) {
		this.transaccions = transaccions;
	}
	
	public String toString()
	{
		return usuUsuario+" "+clave+" "+identificacion+" "+nombre+" "+activo;
	}

}
