package jpabook.jpashop.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Setter
@Getter
@DiscriminatorValue("B")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Book extends Item {

    private String author;
    private String isbn;

}
