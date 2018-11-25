/*
 * Benjamin Petry (www.bpetry.de)
 * Copyright 2017 by Benjamin Petry.
 * This software is provided on an "AS IS" BASIS,
 * without warranties or conditions of any kind, either express or implied.
 */
package de.bpetry.data.observer;

/**
 * Describes actions that may be executed on collections
 * @author Benjamin Petry
 */
public enum CollectionAction
{
    Add(CollectionActionCategory.Add),
    AddAll(CollectionActionCategory.Add),
    SetInsert(CollectionActionCategory.Add),
    SetRemoved(CollectionActionCategory.Remove),
    Remove(CollectionActionCategory.Remove),
    RemoveAll(CollectionActionCategory.Remove),
    Clear(CollectionActionCategory.Remove),
    Update(CollectionActionCategory.Update);// for lists, when an element's position has changed
    
    //-------------------------------------------------------------------------
    ////////////////////////////  Private Variables ///////////////////////////
    //-------------------------------------------------------------------------

    private CollectionActionCategory category;
    
    //-------------------------------------------------------------------------
    //////////////////////////////  Constructor ///////////////////////////////
    //-------------------------------------------------------------------------

    CollectionAction(CollectionActionCategory category)
    {
        this.category = category;
    }
    
    //-------------------------------------------------------------------------
    /////////////////////////////  Public Methods /////////////////////////////
    //-------------------------------------------------------------------------

    public CollectionActionCategory getCategory()
    {
        return this.category;
    }
}
