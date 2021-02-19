package com.kajakaa;
import edu.umd.cs.findbugs.annotations.NonNull
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import groovy.transform.CompileStatic

@CompileStatic
@Introspected
class BookSaved {

    @NonNull
    @NotBlank
    String name


    @NonNull
    @NotBlank
    String isbn
}
