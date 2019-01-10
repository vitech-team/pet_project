

import React, {Component} from "react";
import App from "../app/App";
import {
  Link,
  Route,
} from 'react-router-dom'
import './ApplicationRoute.css';
import Test from "../test/Test";


class ApplicationRoute  extends Component {

  element = (
      <div>
        <ul>
          <li>
            <Link to={"/"}>welcome page</Link>
          </li>
          <li>
            <Link to={"/test"}>test</Link>
          </li>
        </ul>
        <Route exact={true} path="/" component={App} />
        <Route exact={true} path="/test" component={Test}/>
      </div>
  );
  render() {
    return this.element;
  }

}

export default ApplicationRoute;
