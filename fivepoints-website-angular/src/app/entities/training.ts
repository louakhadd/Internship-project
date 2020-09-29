import { trainingCategory } from './trainingCategory';
import { Level } from './level';
import { User } from './User';

export class Training {
    id: number;
    prix: number;
    picture: string;
    title: string;
    description: string;
    nbParticipants: number;
    nbHeuresD: number;
    nbHeuresND: number;
    nblike: number;
    user: User;
    category: trainingCategory;
    level: Level
}