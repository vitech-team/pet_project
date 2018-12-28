import React, {Component} from 'react';
import './App.css';

class App extends Component {
    h1 = "Hello world";

    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <h1>{this.h1}</h1>

                </header>
            </div>
        );
    }
}

export default App;
