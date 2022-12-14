package domain;

import domain.Owner;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-14T15:29:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pet.class)
public class Pet_ { 

    public static volatile SingularAttribute<Pet, String> allergic;
    public static volatile SingularAttribute<Pet, Owner> owner;
    public static volatile SingularAttribute<Pet, String> color;
    public static volatile SingularAttribute<Pet, String> name;
    public static volatile SingularAttribute<Pet, Integer> num_client;
    public static volatile SingularAttribute<Pet, String> breed;
    public static volatile SingularAttribute<Pet, String> specialAttention;

}