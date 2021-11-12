package com.imperatori.marcos.cidadesapi.countries.repository;

import com.imperatori.marcos.cidadesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
