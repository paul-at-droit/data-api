package com.droit.datastore;

/**
 * Created by paul on 3/24/17.
 *
 * A Namespace represents a list of editable units, called Modules. Namespaces can also contan other (sub) Namespaces,
 * and can thus be arranged in arbitrary hierarchies.
 *
 * Root namespaces maintain a change history, marked by commit operations, which version any and all changes made to their
 * sub-components, either Modules or other Namespaces.
 *
 * The content of a Namespace may be edited by many people simultaneously, with conflicting edits being managed by a
 * check-ouy/check-in mechanism. Any componet of a Namespace may be checked out for editing, which creates a new, private
 * work area for editing the contents. If a private work area already exists, that area is re-used.
 *
 * Checked-out changes are incorporated into the shared Namespace by a check-in operation. This checks that the new edits
 * do not conflict with any other edits that have been checked in since the current user checkout, and if so, incorporates
 * them into the Namespace. If there are conflicts, operations are provided to either revert or merge the changes with the
 * master
 */
public interface Namespace extends NamespaceItem {

    NamespaceItem contents();


}
