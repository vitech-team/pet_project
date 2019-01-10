
import React, {Component} from "react";
import "./Test.css";

class Test extends Component{

  constructor(props) {
    super(props);
    this.state = {
      counter: 0
    };
  }

  increment() {
    this.setState((prevState ) => {
      return {counter: prevState.counter + 1}
    });
  }

  decrement() {
    this.setState( (prevState) => {
      return {counter: prevState.counter - 1}
    });
  }


  render() {
    return (
        <div>
          <button className="increment" onClick={this.increment.bind(this)}>increment</button>
          <button className="decrement" onClick={this.decrement.bind(this)}>decrement</button>
          <div>counter is: {this.state.counter}</div>
        </div>
    )
  }

}

export default Test
