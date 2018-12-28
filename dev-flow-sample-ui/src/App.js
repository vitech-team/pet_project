import React, { Component } from 'react';
import './App.css';
import MainComponent from "./MainComponent/MainComponent";

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <MainComponent/>
        </header>
      </div>
    );
  }
}

export default App;
