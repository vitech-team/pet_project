

import React from "react";
import Test from "./Test";
import {configure, shallow} from 'enzyme';
import Adapter from "enzyme-adapter-react-16/build";

configure({adapter: new Adapter()});

describe("Test file", () => {

  it('starts ', () => {
    const wrapper = shallow(<Test/>);
    const countState = wrapper.state().counter ;
    expect(countState).toEqual(0);
  });


  it("cant increment", () => {
    const wrapper = shallow(<Test/>);
    const incrementButton = wrapper.find("button.increment");
    incrementButton.simulate('click');
    const countState = wrapper.state().counter;
    expect(countState).toEqual(1);
  });

  it("can decrement", () => {
    const wrapper = shallow(<Test/>);
    const decrementButton = wrapper.find("button.decrement");
    decrementButton.simulate("click");
    const counterState = wrapper.state().counter;
    expect(counterState).toEqual(-1);
  });


});

