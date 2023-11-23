package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;
import ru.yandex.practicum.contacts.presentation.sort.SortTypeUI;
import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;
import ru.yandex.practicum.contacts.presentation.sort.model.SortType;

public interface ListDiffInterface<T> {
    boolean theSameAs(T newItem);

    boolean equals(Object object);
}
