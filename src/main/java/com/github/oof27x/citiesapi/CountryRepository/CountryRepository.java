package com.github.oof27x.citiesapi.CountryRepository;

import com.github.oof27x.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
