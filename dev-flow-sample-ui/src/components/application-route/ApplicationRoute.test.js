import ApplicationRoute from "./ApplicationRoute";
import { render } from 'enzyme';
import React from 'react';
import Adapter from "enzyme-adapter-react-16";


describe('<ApplicationRoute />', () => {
  it('should ', () => {
    const Wrapper = new ApplicationRoute();
    expect(Wrapper.render()).toEqual(Wrapper.element);
  });
});
