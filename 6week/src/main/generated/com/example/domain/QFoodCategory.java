package com.example.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFoodCategory is a Querydsl query type for FoodCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFoodCategory extends EntityPathBase<FoodCategory> {

    private static final long serialVersionUID = -1774211307L;

    public static final QFoodCategory foodCategory = new QFoodCategory("foodCategory");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<MemberPrefer, QMemberPrefer> memberPrefers = this.<MemberPrefer, QMemberPrefer>createList("memberPrefers", MemberPrefer.class, QMemberPrefer.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QFoodCategory(String variable) {
        super(FoodCategory.class, forVariable(variable));
    }

    public QFoodCategory(Path<? extends FoodCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFoodCategory(PathMetadata metadata) {
        super(FoodCategory.class, metadata);
    }

}

