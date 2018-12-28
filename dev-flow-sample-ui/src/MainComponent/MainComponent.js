import React, {Component} from 'react';
import './MainComponent.css';
import axios from 'axios';

export class MainComponent extends Component{

    constructor(props){
        super(props);
        this.state = {
            user: {
            username: '',
            dateOfVisit: '',
            requestUrl: '',
            }
        }
    }

    async componentDidMount() {
        const result = await axios.get('http://localhost:8080/user');
        const user = result.data;
        user.dateOfVisit = new Date(user.dateOfVisit).toDateString();
        this.setState({user});
    }


    render() {
        return (
            <div className="card">
                <div className="card-header">
                    User Info
                </div>
                <div className="card-body">
                    <p className="card-title text-left">Username: {this.state.user.username}</p>
                    <p className="card-text text-left">Date of Last visit: {this.state.user.dateOfVisit}</p>
                    <p className="card-text text-left">Last request url: {this.state.user.requestUrl}</p>
                </div>
            </div>
        )
    }
}

export default MainComponent
