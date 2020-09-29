import { service } from './service';

export class ServiceRegistration{
    firstname: string;
	lastname: string;
	email: string;
	numTel: string;
	cv: string; //shown only when the user is filling the service form to become a coach
	sujet: string;
	service: service;
}