package com.rendyezaputra.hris.hriswebresources.cqrs.handler;

import com.rendyezaputra.hris.hriswebresources.cqrs.query.BaseQuery;
import com.rendyezaputra.hris.hriswebresources.entity.BaseEntity;
import org.springframework.data.domain.Page;

@FunctionalInterface
public interface QueryHandlerMethod<T extends BaseQuery> {
    Page<BaseEntity> handle(T query);
}
