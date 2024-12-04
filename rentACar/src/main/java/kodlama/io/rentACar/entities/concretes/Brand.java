package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  //Bu anotasyon 'Brand' class'ının bir veritabana nesnesi olduğunu belirtir.
@Table(name = "brands") //Bu 'Brand' class'ı veritabanında 'brands' isimli tabloya karşılık gelir demektir.
//@Data(Getter, Setter ve parametresiz constructor oluşturur.)
@Getter
@Setter
@AllArgsConstructor //Parametreli constructor oluşturur. 
@NoArgsConstructor	//Parametresiz constructor oluşturur. 
public class Brand {
	@Id  //Veritabanında 'primary key'(PK) alanına denk geliyorsun demektir.
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //Veritabanında id'yi otomatik olarak birer birer arttır demektir.
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "brand")
	private List<Model> models;
}


