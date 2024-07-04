import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

@customElement('vista-lista-resultado-item')
export class VistaListaResultadoItem extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch; justify-content: center; align-items: center;">
  <vaadin-vertical-layout theme="spacing" id="layoutFotoPerfil" style="align-self: center;">
   <vaadin-avatar id="vaadinAvatar" style="align-self: center;"></vaadin-avatar>
  </vaadin-vertical-layout>
  <vaadin-button theme="tertiary" id="botonNombreUsuario" style="align-self: center;">
    NombreUsuario 
  </vaadin-button>
  <vaadin-button id="botonSeguir" style="align-self: center;">
    Seguir 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" id="layoutFotoHashtag" style="align-self: center;"></vaadin-vertical-layout>
  <vaadin-button theme="tertiary" id="botonHashtag" style="align-self: center;">
    NombreHashtag 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
