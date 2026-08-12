package com.umb.taller.domain.validation;

@FunctionalInterface
public interface DomainValidator<T> {

    boolean validate(T value);
}
