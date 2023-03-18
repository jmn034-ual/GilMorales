import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-registrarusuario')
export class VistaRegistrarusuario extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; margin: var(--lumo-space-s);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="margin: var(--lumo-space-m); flex-grow: 1;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button style="flex-grow: 1; margin: var(--lumo-space-m);">
   Inicio
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); flex-grow: 1;">
   Iniciar sesión
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); align-self: flex-start; flex-grow: 1;">
   Registrarse 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-xl);">
  <label>Registrarse en la web</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 7%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Nombre: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 7%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Apellidos: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 7%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Email:</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 9%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Contraseña: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 8%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Confirmar:</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 9%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Descripción:</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 15%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Nombre de usuario: </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 9%; align-self: flex-start; flex-shrink: 0; flex-grow: 0; margin: 1%;">
  <label style="width: 100%;">Fecha de nacimiento: </label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
