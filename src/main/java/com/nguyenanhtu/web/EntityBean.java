package com.nguyenanhtu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mytable", catalog = "productsdb")
public class EntityBean implements java.io.Serializable {

	Integer index;
	
	String name;

	@Column(name = "name", length = 10, unique = true)	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="index_2", nullable = false)
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public EntityBean() {
	}
	

	public EntityBean(Integer a, String s) {
		this.index = a;
		this.name = s;
	}
}
