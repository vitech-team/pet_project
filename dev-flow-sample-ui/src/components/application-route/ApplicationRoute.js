

import React, {Component} from "react";
import App from "../app/App";
import DisplayButton from "../display-button/DisplayButton";
import {
  Route,
} from 'react-router-dom'

class ApplicationRoute  extends Component {


  render() {
    return (
        <div>
          <Route exact={true} path="/" component={App} />
          <Route path="/button" component={DisplayButton} />
        </div>
    )
  }

}

export default ApplicationRoute;
