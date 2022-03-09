package com.rendyezaputra.hris.hriswebresources.cqrs.query;

import com.rendyezaputra.hris.hriswebresources.cqrs.handler.QueryHandlerMethod;
import com.rendyezaputra.hris.hriswebresources.entity.BaseEntity;
import org.springframework.data.domain.Page;

public interface QueryDispatcher {
    <T extends BaseQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> handler);
    <U extends BaseEntity> Page<U> send(BaseQuery query);
}
