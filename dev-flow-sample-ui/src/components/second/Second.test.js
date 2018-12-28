import React from 'react';
import ReactDOM from 'react-dom';
import Second from './Second';
import {shallow} from 'enzyme';
import {configure} from "enzyme";
import Adapter from "enzyme-adapter-react-16";
import getName from './Second';

configure({adapter: new Adapter()});

describe('tests', () => {
    test('should return name', () => {
        let second = new Second();
        let fakeName = "Vlad";
        expect(second.getName(fakeName)).toEqual("name is Vlad");
    });
    test('should return none', () => {
        let second = new Second();
        let fakeName;
        expect(second.getName(fakeName)).toEqual('');
    });
    test('should return surname', () => {
        let second = new Second();
        let fakeName = "Surname";
        expect(second.getSurname(fakeName)).toEqual("surname is Surname");
    });
});

