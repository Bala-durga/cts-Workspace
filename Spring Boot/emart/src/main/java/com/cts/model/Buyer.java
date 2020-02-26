package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class Buyer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	

}
