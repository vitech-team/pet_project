import React from 'react';
import ReactDOM from 'react-dom';
import renderer from 'react-test-renderer';
import App from './App';
import {shallow} from 'enzyme';
import {configure} from "enzyme";
import Adapter from "enzyme-adapter-react-16";

configure({adapter: new Adapter()});

describe('test', () => {
    test('app component test should run succesfully', () => {
        let component = new App();
        expect(component.render()).toEqual(component.element);
    })

});

