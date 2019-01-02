import React, {Component} from 'react';

class Second extends Component {
    getName(name) {
        if (name) {
            let nameIs = 'name is ';
            return nameIs + name;
        } else {
            return '';
        }
    }

    getSurname(surname) {
        let surnameIs = 'surname is ';
        return surnameIs + surname;
    }
}

export default Second;
